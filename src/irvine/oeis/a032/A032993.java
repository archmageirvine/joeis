package irvine.oeis.a032;

/**
 * A032993 If d,e are consecutive digits of n in base 11, then |d-e|&gt;=4.
 * @author Sean A. Irvine
 */
public class A032993 extends A032988 {

  @Override
  protected int base() {
    return 11;
  }
}
