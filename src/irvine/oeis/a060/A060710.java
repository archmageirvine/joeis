package irvine.oeis.a060;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A060710 Number of subgroups of dihedral group with 2n elements, counting conjugate subgroups only once, i.e., conjugacy classes of subgroups of the dihedral group.
 * @author Georg Fischer
 */
public class A060710 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A060710() {
    super(new PeriodicSequence(2, 3), 0);
    super.next();
  }
}
