package irvine.oeis.a032;

/**
 * A032996 If d,e are consecutive digits of n in base 8, then |d-e|&gt;=5.
 * @author Sean A. Irvine
 */
public class A032996 extends A032995 {

  @Override
  protected int base() {
    return 8;
  }
}
