package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a024.A024110;

/**
 * A063463 Squarefree numbers arising in A024110.
 * @author Sean A. Irvine
 */
public class A063463 extends FilterSequence {

  /** Construct the sequence. */
  public A063463() {
    super(new A024110(), k -> k.abs().compareTo(Z.ONE) > 0 && Jaguar.factor(k).isSquareFree());
  }
}
