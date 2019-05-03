package irvine.oeis.a020;

import irvine.oeis.Stirling2TransformSequence;
import irvine.oeis.a014.A014500;

/**
 * A020554 Number of multigraphs on n labeled edges <code>(without loops)</code>.
 * @author Sean A. Irvine
 */
public class A020554 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A020554() {
    super(new A014500(), 0);
  }
}
