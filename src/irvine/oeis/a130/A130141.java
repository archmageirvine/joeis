package irvine.oeis.a130;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A130141 Let f denote the map that replaces k with the concatenation of its proper divisors, written in decreasing order, each divisor being written in base 10 in the normal way. Then a(n) = prime reached when starting at 2n+1 and iterating f.
 * @author Sean A. Irvine
 */
public class A130141 implements Sequence {

  private static final Fast PRIME = new Fast();
  private static final String[] VALUES = {
    "13",
    "127",
    "1074079",
    "60407309048887141953335371",
    "185845498742374514124278660344320531777763984538227784588341797",
  };

  private long mN = -1;
  private boolean mPrintProof = false;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z n = Z.valueOf(mN).multiply2().add(1);
    while (true) {
      if (mPrintProof) {
        System.out.println(n.toString());
      }
      if (PRIME.isPrime(n)) {
        return n;
      }
      final FactorSequence fs = Jaguar.factor(n);
      if (mPrintProof) {
        System.out.println(fs);
      }
      final Z[] d = fs.divisorsSorted();
      if (d[1].equals(Z.TWO)) {
        // If we ever get two as last digit, we will never get rid of it
        return Z.NEG_ONE;
      }
      final StringBuilder sb = new StringBuilder();
      for (int k = d.length - 1; k > 0; --k) {
        final Z z = d[k];
        if (!z.equals(n)) {
          sb.append(z);
        }
      }
      n = new Z(sb);
    }
  }

  /**
   * A17 stuff.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {

    if (args.length == 0) {
      System.err.println("Usage: A130141 term or -t");
      return;
    }

    if ("-t".equals(args[0])) {
      final FactorSequence fs = new FactorSequence();
      /*
      final Z n = new Z("73190137764973631955179153612973");
      fs.add(3, FactorSequence.PRIME);
      fs.add(new Z("271770016477"), FactorSequence.PRIME);
      fs.add(new Z("89769699044004904283"), FactorSequence.PRIME);
      */

      final Z n = new Z("19907871795058934542388521769342948217410231790903962382409400440996967981349400135187746100771723");
      for (final String s : VALUES) {
        fs.add(new Z(s), FactorSequence.PRIME);
      }


      final Z[] d = fs.divisors();
      final StringBuilder sb = new StringBuilder();
      Arrays.sort(d);
      for (int k = d.length - 1; k >= 0; --k) {
        final Z z = d[k];
        if (!n.equals(z)) {
          System.out.println(z);
          sb.append(z);
        }
      }
      System.out.println("New n = " + sb);
    } else {
      // Generate partial proof for sequence.
      final A130141 seq = new A130141();
      for (int k = 0; k < Integer.parseInt(args[0]); ++k) {
        seq.next();
      }
      seq.mPrintProof = true;
      seq.next();
    }
  }
}

