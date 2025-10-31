package irvine.oeis.a389;

import irvine.oeis.a037.A037126;
import irvine.oeis.a388.A388853;

/**
 * A388853.
 * @author Sean A. Irvine
 */
public class A389586 extends A388853 {

  /** Construct the sequence. */
  public A389586() {
    super(new A037126(), new A389809());
  }
}

