package irvine.oeis.a078;

import irvine.oeis.InverseSequence;
import irvine.oeis.a385.A385122;

/**
 * A078150 Smallest x such that d[phi(x)]-phi[d(x)]=n, where d()=A000005(),phi()=A000010() restricted to cases when d[phi(x)]-phi[d(x)] is positive.
 * @author Sean A. Irvine
 */
public class A078150 extends InverseSequence {

  /** Construct the sequence. */
  public A078150() {
    super(1, new A385122());
  }
}
