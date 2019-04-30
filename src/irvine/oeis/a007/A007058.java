package irvine.oeis.a007;

import irvine.oeis.Sequence;
import irvine.oeis.a187.A187275;

/**
 * A007058 Let S denote the palindromes in the language <code>{0,1,2,3,4}*; a(n) =</code> number of words of length n in the language SS.
 * @author Sean A. Irvine
 */
public class A007058 extends A007055 {

  @Override
  protected Sequence r() {
    return new A187275();
  }
}
