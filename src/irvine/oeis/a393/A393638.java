package irvine.oeis.a393;

import irvine.oeis.a343.A343060;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393638 allocated for Stanislav Sykora.
 * @author Sean A. Irvine
 */
public class A393638 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393638() {
    super(0, new A343060().getCR().square());
  }
}
