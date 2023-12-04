package irvine.oeis.a067;

import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000079;

/**
 * A067133 n is a term if the phi(n) numbers in [0,n-1] and coprime to n form an arithmetic progression.
 * @author Sean A. Irvine
 */
public class A067133 extends UnionSequence {

  /** Construct the sequence. */
  public A067133() {
    super(new A000040(), new A000079(), new FiniteSequence(6));
  }
}
