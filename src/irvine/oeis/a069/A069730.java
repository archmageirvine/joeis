package irvine.oeis.a069;

import irvine.oeis.Combiner;
import irvine.oeis.PrependSequence;

/**
 * A069730 Number of nonisomorphic unrooted unicursal planar maps with n edges.
 * @author Sean A. Irvine
 */
public class A069730 extends Combiner {

  /** Construct the sequence. */
  public A069730() {
    super(0, new A069727(), new PrependSequence(new A069724(), 0), ADD);
  }
}

