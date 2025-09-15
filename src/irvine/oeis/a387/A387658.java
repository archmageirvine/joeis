package irvine.oeis.a387;

import irvine.oeis.Combiner;
import irvine.oeis.a004.A004018;
import irvine.oeis.a005.A005875;

/**
 * A387658 Number of points on a cubic lattice that have a minimum distance sqrt(n) from either of two adjacent lattice points.
 * @author Sean A. Irvine
 */
public class A387658 extends Combiner {

  /** Construct the sequence. */
  public A387658() {
    super(0, new A004018(), new A005875(), ADD);
  }
}

