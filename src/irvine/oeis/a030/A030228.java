package irvine.oeis.a030;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000105;
import irvine.oeis.a000.A000988;

/**
 * A030228 Number of chiral polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A030228 extends Combiner {

  /** Construct the sequence. */
  public A030228() {
    super(new A000988(), new A000105(), SUBTRACT);
  }
}
