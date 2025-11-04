package irvine.oeis.a389;

import irvine.oeis.a168.A168265;
import irvine.oeis.a388.A388853;

/**
 * A389587 Increasing partition array based on the fractions A168265(n)/A389810(n); see Comments.
 * @author Sean A. Irvine
 */
public class A389587 extends A388853 {

  /** Construct the sequence. */
  public A389587() {
    super(new A168265(), new A389810());
  }
}

