package irvine.oeis.a362;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060843;

/**
 * A362199 Decimal expansion of the sum of the reciprocals of the Busy Beaver numbers (A060843).
 * @author Gregory Morse
 */
public class A362199 extends Sequence1 {
  private final String mDigits;
  private int mN = 0;

  /** Construct the sequence. */
  public A362199() {
    final A060843 bb = new A060843();
    Q sum = Q.ZERO;
    for (int n = 1; n <= 5; ++n) {
      sum = sum.add(new Q(Z.ONE, bb.next()));
    }
    // Kropitz's May 2010 machine gives BB(6) > 10^21000 (Michel, historical survey).
    // BB is nondecreasing. Also BB(n) >= n^2/16 for n >= 6: use
    // 2*k+1 states to lay down k marks, turn around and sweep them k times.
    // Split the tail at 10^10500. Its sum is less than 17 * 10^(-10500).
    final Z lower = sum.multiply(Z.TEN.pow(10498)).floor();
    final String lo = lower.toString();
    final String hi = lower.add(1).toString();
    int k = 0;
    while (k < lo.length() && lo.charAt(k) == hi.charAt(k)) {
      ++k;
    }
    mDigits = lo.substring(0, k);
  }

  @Override
  public Z next() {
    if (mN >= mDigits.length()) {
      throw new UnsupportedOperationException("Digit not determined by the known Busy Beaver bounds");
    }
    return Z.valueOf(mDigits.charAt(mN++) - '0');
  }
}
