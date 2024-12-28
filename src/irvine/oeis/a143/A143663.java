package irvine.oeis.a143;

import irvine.oeis.a007.A007138;

/**
 * A143663 a(n) is the least prime such that the multiplicative order of 3 mod a(n) equals n, or a(n)=1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A143663 extends A007138 {

  /** Construct the sequence. */
  public A143663() {
    super(3);
  }
}
