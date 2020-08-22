package irvine.oeis.a032;

/**
 * A032997 If d,e are consecutive digits of n in base 9, then |d-e|&gt;=5.
 * @author Sean A. Irvine
 */
public class A032997 extends A032995 {

  @Override
  protected int base() {
    return 9;
  }
}
