package irvine.oeis.a098;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A098594 Numbers n such that n!-1 and n!+1 are both semiprime.
 * @author Sean A. Irvine
 */
public class A098594 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN;
  private Z mF = Z.ONE;

  private A098594(final int start) {
    mN = start;
    for (int k = 2; k <= start; ++k) {
      mF = mF.multiply(k);
    }
  }

  /** Construct the sequence. */
  public A098594() {
    this(0);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mF = mF.multiply(mN);
      }
      if (mVerbose) {
        System.out.println("[" + mN + "]");
        System.out.flush();
      }
      final int spM = Jaguar.factorUpToSemiprime(mF.subtract(1)).isSemiprime();
      if (spM == FactorSequence.NO) {
        continue;
      }
      if (mVerbose && spM == FactorSequence.YES) {
        System.out.println(mN + "!-1 is semiprime");
        System.out.flush();
      }
      final int spP = Jaguar.factorUpToSemiprime(mF.add(1)).isSemiprime();
      if (spP == FactorSequence.NO) {
        continue;
      }
      if (spP == FactorSequence.YES && spM == FactorSequence.YES) {
        return Z.valueOf(mN);
      }
      throw new UnsupportedOperationException("Factors unknown: " + mN + "!+/-1: " + spM + " " + spP);
    }
  }

  /**
   * Run from a particular start point.
   * @param args start point
   */
  public static void main(final String[] args) {
    final A098594 seq = new A098594(args.length > 0 ? Integer.parseInt(args[0]) - 1 : 0);
    while (true) {
      System.out.println(seq.next());
    }
  }
}

/*

Potential candidates <= 2000

929 1024843.P2350 C2356
1416 C3849 C3849
1513 C4156 C4156
1645 C4579 C4579
1672 C4666 C4666
1689 C4720 C4720
1699 C4753 C4753
1734 C4866 C4866
1753 C4928 C4928
1843 C5220 C5220
1979 C5667 C5667

Built with:
java irvine.factor.project.factorial.Factorial -t -m 464 -M 10000 src/irvine/factor/project/factorial/factorials*.txt >~/dump

Then manually separate dump into dumpm and dumpp files, removing the !-1 and !+1
join dumpm dumpp >dump
cat dump | grep -v '[0-9]\.[C0-9]' | less

*/
