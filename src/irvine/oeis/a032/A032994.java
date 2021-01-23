package irvine.oeis.a032;

/**
 * A032994 If d,e are consecutive digits of n in base 12, then |d-e|&gt;=4.
 * @author Sean A. Irvine
 */
public class A032994 extends A032988 {

  @Override
  protected int base() {
    return 12;
  }
}
