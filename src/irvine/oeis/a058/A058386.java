package irvine.oeis.a058;

import irvine.oeis.PrependSequence;

/**
 * A058386 Essentially series series-parallel networks with n unlabeled edges, multiple edges not allowed.
 * @author Sean A. Irvine
 */
public class A058386 extends PrependSequence {

  /** Construct the sequence. */
  public A058386() {
    super(new A058385().skip(3), 0, 0, 1);
  }
}

