package irvine.oeis.a020;

import irvine.oeis.a014.A014500;
import irvine.oeis.transform.Stirling2TransformSequence;

/**
 * A020554 Number of multigraphs on n labeled edges (without loops).
 * @author Sean A. Irvine
 */
public class A020554 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A020554() {
    super(new A014500(), 0);
  }
}
