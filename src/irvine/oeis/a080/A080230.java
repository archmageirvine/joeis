package irvine.oeis.a080;

import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a078.A078756;

/**
 * A080230 Engel expansion for (positive) constant defined in A078756.
 * @author Sean A. Irvine
 */
public class A080230 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A080230() {
    super(new A078756().getCR());
  }
}

