package irvine.oeis.a070;

import irvine.oeis.Combiner;
import irvine.oeis.a002.A002330;
import irvine.oeis.a002.A002331;

/**
 * A070079 a(n) gives the odd leg of the unique primitive Pythagorean triangle with hypotenuse A002144(n).
 * @author Sean A. Irvine
 */
public class A070079 extends Combiner {

  /** Construct the sequence. */
  public A070079() {
    super(1, new A002330().skip(), new A002331().skip(), (a, b) -> a.square().subtract(b.square()));
  }
}
