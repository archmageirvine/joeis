package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A010351 Base-8 Armstrong or narcissistic numbers, written in base 8.
 * @author Sean A. Irvine
 */
public class A010351 extends FiniteSequence {

  /** Construct the sequence. */
  public A010351() {
    super(1, FINITE, Z.ONE, Z.TWO, Z.THREE, Z.FOUR, Z.FIVE, Z.SIX, Z.SEVEN,
      new Z("24"),
      new Z("64"),
      new Z("134"),
      new Z("205"),
      new Z("463"),
      new Z("660"),
      new Z("661"),
      new Z("40663"),
      new Z("42710"),
      new Z("42711"),
      new Z("60007"),
      new Z("62047"),
      new Z("636703"),
      new Z("3352072"),
      new Z("3352272"),
      new Z("3451473"),
      new Z("4217603"),
      new Z("7755336"),
      new Z("16450603"),
      new Z("63717005"),
      new Z("233173324"),
      new Z("3115653067"),
      new Z("4577203604"),
      new Z("61777450236"),
      new Z("147402312024"),
      new Z("360507431167"),
      new Z("1323324472142"),
      new Z("1334013135714"),
      new Z("1334413135714"),
      new Z("1647540560022"),
      new Z("3017145740336"),
      new Z("4327761411137"),
      new Z("7173174033776"),
      new Z("1711433054170213"),
      new Z("1711433054370212"),
      new Z("216040024735257750"),
      new Z("216040024735257751"),
      new Z("223407227764431646"),
      new Z("1211032521007154743"),
      new Z("1232302004675154740"),
      new Z("1232302004675154741"),
      new Z("1232723462574551323"),
      new Z("1253541301300706674"),
      new Z("1253541301302706674"),
      new Z("3124771732711450547"),
      new Z("3124775743435202477"),
      new Z("11217560142462145753"),
      new Z("26270437173711052754"),
      new Z("275625505717602076277"),
      new Z("174521742707223255307557"),
      new Z("1327077532453743552700004"),
      new Z("1561571732777266703512144"),
      new Z("1567777710567602656453055"),
      new Z("1567777750567602656453054"),
      new Z("11254613377540170731271074472")
      );
  }
}
