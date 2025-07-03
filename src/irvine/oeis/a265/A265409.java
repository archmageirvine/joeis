package irvine.oeis.a265;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a240.A240025;

/**
 * A265409 a(n) = index to the nearest inner neighbor in Ulam-style square-spirals using zero-based indexing.
 * @author Sean A. Irvine
 */
public class A265409 extends CachedSequence {

  private final DirectSequence mA = DirectSequence.create(new A240025());

  /** Construct the sequence. */
  public A265409() {
    super(1);
  }

  @Override
  protected Z compute(final Z n) {
    if (n.compareTo(Z.SEVEN) <= 0) {
      return Z.ZERO;
    }
    return mA.a(n).isOne() || mA.a(n.subtract(1)).isOne() ? a(n.subtract(1)) : a(n.subtract(1)).add(1);
  }
}

