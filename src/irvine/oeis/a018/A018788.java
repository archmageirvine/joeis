package irvine.oeis.a018;

/**
 * A018788 Number of subsets of <code>{1,</code>...,n} containing <code>an</code> arithmetic progression of length 3.
 * @author Sean A. Irvine
 */
public class A018788 extends A018794 {

  @Override
  protected int ap() {
    return 3;
  }
}
