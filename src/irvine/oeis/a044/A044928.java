package irvine.oeis.a044;

/**
 * A044928 a(n)=so-se, where so(se)=sum of odd(even) base 6 run lengths of n.
 * @author Sean A. Irvine
 */
public class A044928 extends A044924 {

  @Override
  protected int base() {
    return 6;
  }
}

