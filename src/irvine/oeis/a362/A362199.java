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
  private static final int SPLIT_DIGITS = 21_000;

  private final String mDigits;
  private int mN = 0;

  /** Construct the sequence. */
  public A362199() {
    final A060843 bb = new A060843();
    Q sum = Q.ZERO;
    for (int n = 1; n <= 5; ++n) {
      sum = sum.add(new Q(Z.ONE, bb.next()));
    }
    // Ligocki's e78k witness, checked directly from its transition table
    // by the internal E78kWitness checker. Three zero-block sweeps
    // determine the length of the last iteration. That iteration alone
    // takes more than 2^(2*(triples-1)) steps.
    final int first = 3 * (1 << (8 / 3)) - 2;
    final int second = 3 * (1 << ((4 * first + 6) / 3)) - 2;
    final int triples = (4 * second + 4) / 3;
    if (Z.ONE.shiftLeft(2 * (triples - 1)).compareTo(Z.TEN.pow(2 * SPLIT_DIGITS)) <= 0) {
      throw new IllegalStateException("The six-state witness does not give the required tail bound");
    }
    // BB is nondecreasing. For k=floor(n/2), k states lay down k marks
    // and k states alternately sweep left and right; this takes at least
    // k^2 steps. In particular BB(n) >= n^2/16 for n >= 6. Before
    // the split use BB(6); after it bound the sum by the integral of
    // 16/x^2. The total error is less than 17 * 10^(-SPLIT_DIGITS).
    final Z lower = sum.multiply(Z.TEN.pow(SPLIT_DIGITS - 2)).floor();
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
