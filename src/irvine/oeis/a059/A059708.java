package irvine.oeis.a059;

import irvine.oeis.UnionSequence;
import irvine.oeis.a014.A014261;
import irvine.oeis.a014.A014263;

/**
 * A059708 Numbers n such that all digits have same parity.
 * @author Sean A. Irvine
 */
public class A059708 extends UnionSequence {

  /** Construct the sequence. */
  public A059708() {
    super(new A014261(), new A014263());
  }
}

