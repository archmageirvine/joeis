package irvine.oeis.a048;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007947;

/**
 * A048803 a(0) = 1, a(1) = 1; for n &gt; 1, a(n) = lcm( 1, 2, ..., n, a(1)*a(n-1), a(2)*a(n-2), ..., a(n-1)*a(1) ).
 * @author Sean A. Irvine
 */
public class A048803 extends PartialProductSequence {

  /** Construct the sequence. */
  public A048803() {
    super(new PrependSequence(new A007947(), 1));
  }
}
