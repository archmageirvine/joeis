package irvine.oeis.a044;

/**
 * A044929 a(n)=so-se, where so(se)=sum of odd(even) base 7 run lengths of n.
 * @author Sean A. Irvine
 */
public class A044929 extends A044924 {

  @Override
  protected int base() {
    return 7;
  }
}

