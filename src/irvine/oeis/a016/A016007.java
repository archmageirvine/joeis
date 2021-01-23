package irvine.oeis.a016;

/**
 * A016007 a(n) = (tau(n^11)+10)/11.
 * @author Sean A. Irvine
 */
public class A016007 extends A016006 {

  @Override
  protected int power() {
    return 11;
  }
}
