package irvine.oeis.a044;

/**
 * A044932 a(n)=so-se, where so(se)=sum of odd(even) base 10 run lengths of n.
 * @author Sean A. Irvine
 */
public class A044932 extends A044924 {

  @Override
  protected int base() {
    return 10;
  }
}

