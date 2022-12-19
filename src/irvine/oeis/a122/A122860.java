package irvine.oeis.a122;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A122860 Expansion of (1 - phi(-q)^3 / phi(-q^3)) / 6 in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A122860 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A122860() {
    super(new PeriodicSequence(1, -3, 0, 3, -1, 0), 0);
    super.next();
  }
}
