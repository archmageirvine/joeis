package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a006.A006939;

/**
 * A387491 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A387491 extends TwoParameterFormSequence {

  private static final DirectSequence Q = DirectSequence.forceCreate(0, new A006939());

  /** Construct the sequence. */
  public A387491() {
    super(1, 0, 0, (m, r) -> m > 0 || r == 0 ? Functions.PRIMORIAL_COUNT.z(m).pow(r).multiply(Q.a(m.intValue())) : null);
  }
}

