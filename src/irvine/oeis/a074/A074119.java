package irvine.oeis.a074;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A074119 Seventh root of n contains n as a string of digits to the immediate right of the decimal point (excluding leading zeros).
 * @author Sean A. Irvine
 */
public class A074119 extends Sequence1 {

  // After Jon E. Schoenfield

  private static final int PRECISION = -1000;
  private static final CR R01 = CR.valueOf(new Q(1, 10));
  private final int mRoot;
  private final CR mInv;
  private final TreeSet<Z> mSolutions = new TreeSet<>();
  private long mK = 0;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  protected A074119(final int root) {
    mRoot = root;
    mInv = CR.valueOf(new Q(1, root));
  }

  /** Construct the sequence. */
  public A074119() {
    this(7);
  }

  @Override
  public Z next() {
    while (mSolutions.isEmpty()) {
      ++mK;
      final Z iMin = Z.valueOf(mK).pow(mRoot).add(1);
      final Z iMax = Z.valueOf(mK + 1).pow(mRoot).subtract(1);
      if (mVerbose) {
        StringUtils.message("Starting the search for [" + iMin + ".." + iMax + "]");
      }
      final int nDgtsIMin = Functions.DIGIT_LENGTH.i(iMin);
      final int nDgtsIMax = Functions.DIGIT_LENGTH.i(iMax);
      for (int nDgitsI = nDgtsIMin; nDgitsI <= nDgtsIMax; ++nDgitsI) {
        final Z tenToNDgtsI = Z.TEN.pow(nDgitsI);
        Z i = nDgitsI == nDgtsIMin ? iMin : Z.TEN.pow(nDgitsI - 1);
        CR r = CR.valueOf(i).pow(mInv);

        CR t = r.subtract(mK);
        int z = 0; // z will be max number of leading zeros
        while (t.compareTo(R01) < 0) {
          ++z;
          t = t.multiply(10);
        }

        CR rMaxKZ = R01.pow(z).add(mK); // k followed by decimal pt, (z-1) zeros, & a 1
        while (true) {
          while (r.compareTo(rMaxKZ, PRECISION) < 0) {
            // Get integer formed from first nDgtsI digits of fractional part of root of i, skipping any leading zeros
            final Z iTest = r.subtract(mK).multiply(Z.TEN.pow(z + nDgitsI)).floor();
            final int iCmp = iTest.compareTo(i);
            if (iCmp >= 0) {
              if (iCmp == 0) {
                mSolutions.add(i);
                i = i.add(1);
              } else {
                i = iTest;
              }
            } else {
              // iTest < i
              final CR rTemp = R01.pow(z + nDgitsI).multiply(i).add(mK);
              i = rTemp.pow(mRoot).ceil();
            }
            if (i.compareTo(tenToNDgtsI) >= 0) {
              break;
            }
            r = CR.valueOf(i).pow(mInv);
          }
          if (i.compareTo(tenToNDgtsI) >= 0) {
            break;
          }

          // r > "k." + z*"0" + "99999999..."
          if (z == 0) {
            break;
          }
          --z;
          r = rMaxKZ;
          rMaxKZ = R01.pow(z).add(mK);
          i = r.pow(mRoot).ceil();
          r = CR.valueOf(i).pow(mInv);
        }
      }
    }
    return mSolutions.pollFirst();
  }
}
