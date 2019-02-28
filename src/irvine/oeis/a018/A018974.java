package irvine.oeis.a018;

/**
 * A018974.
 * @author Sean A. Irvine
 */
public class A018974 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AHT
    return "a-1: a-10(000) a-9(+00) b-6(000) a-5(000)\n"
      + "a-5: a-12(000) a-11(0+0)\n"
      + "b-6: a-11(000)\n"
      + "a-9: a-11(000)\n"
      + "a-10: a-12(00+)\n"
      + "b-2: a-9(000) b-8(000) b-6(000) a-5(000)\n"
      + "b-8: a-12(00+)\n"
      + "a-3: a-10(-0-) a-9(000) b-8(00-) a-7(00-)\n"
      + "a-7: a-12(0-+) a-11(000)\n"
      + "b-4: a-10(00-) b-8(00-) a-7(00-) b-6(000)\n";
  }
}

