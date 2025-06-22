package irvine.oeis.a078;

import irvine.oeis.a001.A001113;
import irvine.oeis.a014.A014777;

/**
 * A078197 Position of the start of the first occurrence of n after the decimal point in e = 2.71828182845904523536...
 * @author Sean A. Irvine
 */
public class A078197 extends A014777 {

  /** Construct the sequence. */
  public A078197() {
    super(new A001113().skip());
  }
}
