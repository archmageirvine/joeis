package irvine.oeis.a104;
// manually 2025-09-25/rapt at 2025-09-25 16:09

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000031;
import irvine.oeis.transform.RationalProductTransform;

/**
 * A104510 G.f.: Product_{i&gt;=1} (1 - 2*(-x)^i)/(1 - (-x)^i)^2.
 * @author Georg Fischer
 */
public class A104510 extends RationalProductTransform {

  private static final DirectSequence A000031 = new A000031();

  /** Construct the sequence. */
  public A104510() {
    super(1);
    this.f(k -> A000031.a(k).subtract(2).negate()).g(k -> Z.NEG_ONE.pow(k));
    next();
  }
}
