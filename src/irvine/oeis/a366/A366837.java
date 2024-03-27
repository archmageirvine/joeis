package irvine.oeis.a366;
// manually 2024-03-25/serrev at 2024-03-25 22:35

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.GeneratingFunctionSequence;
import irvine.oeis.transform.RevertTransformSequence;

/**
 * A366837 Expansion of the unique real solution y(t) to the equation y*(1+y)^2/((1-y)*(1-y^3)) = t/(1+3t) with initial value y(0)=0.
 * @author Georg Fischer
 */
public class A366837 extends PrependSequence {

  /** Construct the sequence. */
  public A366837() {
    super(0, new RevertTransformSequence(0, new GeneratingFunctionSequence(1, "[0, 1, 2, 1]", "[1, -4, -6, -4, 1]")), 0);
  }
}
