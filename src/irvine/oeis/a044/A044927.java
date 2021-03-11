package irvine.oeis.a044;

/**
 * A044927 a(n)=so-se, where so(se)=sum of odd(even) base 5 run lengths of n.
 * @author Sean A. Irvine
 */
public class A044927 extends A044924 {

  @Override
  protected int base() {
    return 5;
  }
}

