package irvine.oeis.a044;

/**
 * A044931 a(n) = so-se, where so(se)=sum of odd(even) base 9 run lengths of n.
 * @author Sean A. Irvine
 */
public class A044931 extends A044924 {

  @Override
  protected int base() {
    return 9;
  }
}

