package irvine.math.expression;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Expression evaluator.
 * @author Sean A. Irvine
 */
public final class Sircon {

  private Sircon() { }

  /**
   * Construct the given expression.
   * @param expression expression to evaluate
   * @return value of expression
   */
  public static Expression parse(final String expression) {
    final CharStream input = CharStreams.fromString(expression);
    final GrammarLexer lexer = new GrammarLexer(input);
    final CommonTokenStream tokens = new CommonTokenStream(lexer);
    final GrammarParser parser = new GrammarParser(tokens);
    parser.setBuildParseTree(true);
    final GrammarParser.ExprContext tree = parser.expr();
    //tree.inspect(parser); // show in gui
    return tree.v;
  }

  /**
   * Parse an integer expression.
   * @param args ignored
   */
  public static void main(final String[] args) {
    for (final String a : args) {
      System.out.println(parse(a).eval());
    }
  }

}
