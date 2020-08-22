package irvine.oeis.a032;

/**
 * A032989 If d,e are consecutive digits of n in base 7, then |d-e|&gt;=4.
 * @author Sean A. Irvine
 */
public class A032989 extends A032988 {

  @Override
  protected int base() {
    return 7;
  }
}
