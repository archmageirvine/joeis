package irvine.oeis.a033;

import irvine.oeis.PositionOfNSequence;
import irvine.oeis.a006.A006577;

/**
 * A033491 <code>a(n)</code> is the smallest integer that takes n halving and tripling steps to reach 1 in the <code>3x+1</code> problem.
 * @author Sean A. Irvine
 */
public class A033491 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A033491() {
    super(new A006577(), 0);
  }
}

