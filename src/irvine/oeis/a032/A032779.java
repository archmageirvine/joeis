package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A032779 Integer quotients n(n+1)(n+2)...(n+7) / (n+(n+1)+(n+2)+...+(n+7)).
 * @author Sean A. Irvine
 */
public class A032779 extends FiniteSequence {

  /** Construct the sequence. */
  public A032779() {
    super(Z.ZERO,
      new Z("1120"),
      new Z("110880"),
      new Z("1441440"),
      new Z("5189184"),
      new Z("58605120"),
      new Z("349949600"),
      new Z("639381600"),
      new Z("3765731200"),
      new Z("12841684128"),
      new Z("136367431200"),
      new Z("1442885004000"),
      new Z("4895245266912"),
      new Z("28461435424576"),
      new Z("51671930508000"),
      new Z("300266024938880"),
      new Z("3166522452945280"),
      new Z("10732052830603104"),
      new Z("113147219464269120"),
      new Z("4042298250019931616"),
      new Z("23477359157557576768"),
      new Z("247487174102196142400"),
      new Z("8840946167237539409472"),
      new Z("19335256163751713184766624")
    );
  }
}
