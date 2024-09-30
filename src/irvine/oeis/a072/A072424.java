package irvine.oeis.a072;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A072424 The five's sequence merely counts the letters in the words of the generating sentence.
 * @author Sean A. Irvine
 */
public class A072424 extends Sequence1 {

  private final LinkedList<String> mA = new LinkedList<>();
  private int mN = 0;

  /** Construct the sequence. */
  public A072424() {
    mA.add("fives");
    mA.add("the");
    mA.add("number");
    mA.add("of");
    mA.add("the");
    mA.add("letters");
    mA.add("in");
    mA.add("the");
    mA.add("first");
    mA.add("word");
    mA.add("of");
    mA.add("this");
    mA.add("sentence");
  }

  @Override
  public Z next() {
    final int len = mA.pollFirst().length();
    if (++mN > 1) {
      mA.add(English.SINGLETON.toText(len));
      mA.add("in");
      mA.add("the");
      mA.add(English.SINGLETON.toOrdinalText(mN));
    }
    //System.out.println(mA);
    return Z.valueOf(len);
  }
}

