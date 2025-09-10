package irvine.oeis.a080;

import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a078.A078756;

/**
 * A080231 Engel expansion for (negative) constant defined in A078756.
 * @author Sean A. Irvine
 */
public class A080231 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A080231() {
    super(new A078756().getCR().negate());
  }
}

