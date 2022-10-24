package irvine.oeis.a059;

import irvine.oeis.a006.A006508;

/**
 * A059407 a(n+1) = a(n)-th composite number, with a(1) = 11.
 * @author Sean A. Irvine
 */
public class A059407 extends A006508 {

  /** Construct the sequence. */
  public A059407() {
    super(11);
    setOffset(1);
  }
}
