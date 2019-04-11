package irvine.oeis.a007;

import irvine.oeis.Sequence;
import irvine.oeis.a187.A187273;

/**
 * A007056 Let S denote the palindromes in the language <code>{0,1,2}*</code>; <code>a(n) =</code> number of words of length n in the language SS.
 * @author Sean A. Irvine
 */
public class A007056 extends A007055 {

  @Override
  protected Sequence r() {
    return new A187273();
  }
}
