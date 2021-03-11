package irvine.oeis.a044;

/**
 * A044925 a(n)=so-se, where so(se)=sum of odd(even) base 3 run lengths of n.
 * @author Sean A. Irvine
 */
public class A044925 extends A044924 {

  @Override
  protected int base() {
    return 3;
  }
}

