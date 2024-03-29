package irvine.oeis.a033;

import irvine.oeis.InverseSequence;
import irvine.oeis.a006.A006577;

/**
 * A033491 a(n) is the smallest integer that takes n halving and tripling steps to reach 1 in the 3x+1 problem.
 * @author Sean A. Irvine
 */
public class A033491 extends InverseSequence {

  /** Construct the sequence. */
  public A033491() {
    super(0, new A006577(), 0);
  }
}

