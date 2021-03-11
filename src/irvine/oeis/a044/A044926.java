package irvine.oeis.a044;

/**
 * A044926 a(n)=so-se, where so(se)=sum of odd(even) base 4 run lengths of n.
 * @author Sean A. Irvine
 */
public class A044926 extends A044924 {

  @Override
  protected int base() {
    return 4;
  }
}

