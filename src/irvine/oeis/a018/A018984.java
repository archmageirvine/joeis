package irvine.oeis.a018;

/**
 * A018984 Cycle class sequence c(2n) (the number of true cycles of length 2n in which a certain node is included) for zeolite ATO = AlPO4-31 [ Al18P18O72 ].
 * @author Sean A. Irvine
 */
public class A018984 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // ATO
    return "a-1: a-10(000) a-5(+++) a-5(000) a-4(00+)\n"
      + "a-4: a-7(000)\n"
      + "a-5: a-9(000)\n"
      + "a-2: a-12(000) a-6(+00) a-4(+++) a-4(000)\n"
      + "a-6: a-8(000)\n"
      + "a-3: a-11(000) a-6(+++) a-6(000) a-5(0+0)\n"
      + "a-7: a-11(000) a-11(---) a-10(00-)\n"
      + "a-9: a-12(000) a-12(---) a-11(0-0)\n"
      + "a-8: a-12(-00) a-10(000) a-10(---)\n";
  }
}

