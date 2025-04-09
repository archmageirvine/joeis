package irvine.oeis.a076;

import irvine.oeis.a016.A016733;
import irvine.oeis.a032.A032523;

/**
 * A076594 First occurrence of n as a term in the continued fraction for log(5).
 * @author Sean A. Irvine
 */
public class A076594 extends A032523 {

  /** Construct the sequence. */
  public A076594() {
    super(new A016733());
  }
}
