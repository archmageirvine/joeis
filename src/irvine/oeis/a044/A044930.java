package irvine.oeis.a044;

/**
 * A044930 a(n)=so-se, where so(se)=sum of odd(even) base 8 run lengths of n.
 * @author Sean A. Irvine
 */
public class A044930 extends A044924 {

  @Override
  protected int base() {
    return 8;
  }
}

